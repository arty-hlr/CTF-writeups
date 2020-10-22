from swpag_client import Team

team = Team("http://api.ictf2019.net/", "LZVEJPloybmXXvdCW4UN") 
vm_info = team.get_vm()

key = vm_info['ctf_key']
with open('key','w') as f:
    f.write(key)
print("IP: " + vm_info['ip'])

print('-' * 20);

# print("GAME_STATUS")
# print(team.get_game_status())
print("TEAM_STATUS")
print(team.get_team_status())
# print("SERVICE_LIST")
# print(team.get_service_list())
