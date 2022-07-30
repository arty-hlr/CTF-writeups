#-------------------------------------------------------------------------------
# Save All waveforms to USB every time scope triggers
# Required packages
# python        2.7         (http://www.python.org/)
# pyvisa        1.4         (http://pyvisa.sourceforge.net/)
# pyvisa-py                 (https://pyvisa-py.readthedocs.io/en/latest/)
# pyserial                  (https://pypi.org/project/pyserial/)
#-------------------------------------------------------------------------------
import visa
import time
import random
import serial

#Set the appropriate traces number
NUMBER_OF_TRACES = 1

#Connect to the instrument
rm = visa.ResourceManager('@py')
print('Resources list:')
resources = rm.list_resources()
print(resources)
for devname in resources:
    if 'USB0::1689' in devname:
        break;
print(devname)
try:
    scope = rm.open_resource(devname)
except:
    print('No scope connected - scope not available -- Exiting now!')
    quit()


#Configure how files are saved, setting resolution to reduced will be faster,
# but you get less actual data
scope.write("SAVE:WAVEFORM:FILEFORMAT SPREADSHEET")
scope.write("SAVE:WAVEFORM:SPREADSHEET:RESOLUTION FULL")

#Create directory on USB stick where files will be saved
scope.write("FILESYSTEM:MKDIR \"E:/Traces\"")

#Start single sequence acquisition
scope.write("ACQ:STOPA SEQ")

for loop in range(NUMBER_OF_TRACES):

    print('On Loop {}'.format(loop))
    #Arm trigger, then loop until scope has triggered
    scope.write("ACQ:STATE ON")
    time.sleep(0.5)

    # INSERT here communication to the target.

    #Rules
    #Serial communication parameters are 9600-8-N-1
    #Commands are in the for p[plaintext to encrypt 16bytes blocks in hex in format 00AABBCC...\n]
    #Triggers two responses: One R[Encypted text 16bytes] and one ACK that can be ignored or used.
    #Send x with no \n to reset the device under test to a known state


    print('Reply on loop {}: {}'.format(loop,line))
    while '1' in scope.query("ACQ:STATE?"):
        time.sleep(0.5)

    #save all waveforms, then wait for the waveforms to be written
    scope.write("SAVE:WAVEFORM ALL, \"E:/Traces/All_{}\"".format(loop))
    while '1' in scope.query("BUSY?"):
        time.sleep(0.5)

