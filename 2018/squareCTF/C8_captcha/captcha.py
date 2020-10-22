#!/usr/bin/python3
# -*- coding: Utf-8 -*-
# Fichier : captcha.py
# Auteur : Baron Louis

import requests, base64
from fontTools.ttLib import TTFont

correlationChiffresPixels = {   'xMin="0" yMin="-128" xMax="290" yMax="747">' : '(',
                                'xMin="0" yMin="-128" xMax="290" yMax="747">' : ')',
                                'xMin="0" yMin="0" xMax="585" yMax="660">' : '0',
                                'xMin="0" yMin="0" xMax="311" yMax="673">' : '1',
                                'xMin="0" yMin="0" xMax="497" yMax="704">' : '2',
                                'xMin="0" yMin="0" xMax="548" yMax="684">' : '3',
                                'xMin="0" yMin="-3" xMax="576" yMax="690">' : '4',
                                'xMin="0" yMin="0" xMax="531" yMax="690">' : '5',
                                'xMin="0" yMin="0" xMax="544" yMax="679">' : '6',
                                'xMin="0" yMin="0" xMax="510" yMax="696">' : '7',
                                'xMin="0" yMin="0" xMax="569" yMax="689">' : '8',
                                'xMin="0" yMin="0" xMax="561" yMax="689">' : '9',
                                'xMin="0" yMin="0" xMax="495" yMax="519">' : '+',
                                'xMin="0" yMin="0" xMax="465" yMax="347">' : '-',
                                'xMin="0" yMin="0" xMax="444" yMax="481">' : '*'}

s = requests.Session() #Permet de gerer le cookie de session.
page = s.get("https://hidden-island-93990.squarectf.com/ea6c95c6d0ff24545cad").text #Get de la page du captcha
token = str(page.partition('name="token" value="')[2].partition('"')[0])
op = str(page.partition("<body><h1>Captcha</h1><p>")[2].partition("</p><html><body>")[0])
b64 = str(page.partition("charset=utf-8;base64,")[2].partition("\');}")[0])

b64ToBin = base64.b64decode(b64)
file = open("./b64FontFile.ttf", "wb")
file.write(b64ToBin)
file.close()

font = TTFont("./b64FontFile.ttf")
font.saveXML("./b64FontFile.xml")
file = open("./b64FontFile.xml", 'r')
xmlFile = file.readlines()

correaltionGlyphLettres = {}
for i in range(153,168):
    correaltionGlyphLettres[xmlFile[i].strip()[23:33]] = chr(int(xmlFile[i].strip()[13:15], 16))

correlationLettresChiffres = {}
for i in range(250, 963):
    if xmlFile[i].strip().startswith('<TTGlyph name="') and xmlFile[i].strip()[27:] != 'xMin="0" yMin="-128" xMax="290" yMax="747">':
        correlationLettresChiffres[correaltionGlyphLettres[xmlFile[i].strip()[15:25]]] = correlationChiffresPixels[xmlFile[i].strip()[27:]]
correlationLettresChiffres[op[0]] = '('
correlationLettresChiffres[op[-1]] = ')'
correlationLettresChiffres[' '] = ' '

print(correlationLettresChiffres)
print(op)
finalOP = ''
for c in range(0,len(op)):
    finalOP = finalOP + correlationLettresChiffres[op[c]]
print(finalOP)

result = eval(finalOP) #Execute l'operation et la stock dans result.
r = s.post('https://hidden-island-93990.squarectf.com/ea6c95c6d0ff24545cad', data={'answer':str(result), 'token':token}) #Effectue une requete post avec le captcha et le token
print("\nflag is : " + r.text.partition("<li>You can disable this system using ")[2].partition("</li><li><p>You should be given")[0]) #Affiche la avec le flag.