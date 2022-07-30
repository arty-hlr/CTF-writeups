with open("emojis.txt", "r") as f:
    emojis = f.read()

print(emojis)
emoji_dict = {}
i = 0
letter = 'a'
letter_list = []
for emoji in emojis:
    cur_letter = chr(ord(letter)+i)
    if emoji == '_':
        continue
    elif emoji not in emoji_dict:
        emoji_dict[emoji] = cur_letter
        i += 1

for emoji in emojis:
    if emoji == '_':
        letter_list.append('_')
    elif emoji_dict[emoji] == 'c':
        letter_list.append(' ')
    else:
        letter_list.append(emoji_dict[emoji])
print(i)
letter_string = ''.join(letter_list)
print(letter_string)
