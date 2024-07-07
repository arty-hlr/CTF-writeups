def decrypt(encrypted):
    decrypted = ""
    for i in range(len(encrypted)):
        decrypted += chr(encrypted[i] ^ 0x42)
    return decrypted

# print(decrypt([1, 45, 44, 37, 48, 35, 54, 55, 46, 35, 54, 43, 45, 44, 49, 99, 99, 98, 27, 45, 55, 98,
#        33, 35, 44, 98, 52, 35, 46, 43, 38, 35, 54, 39, 98, 53, 43, 54, 42, 120, 72, 46, 39, 10,
#        3, 1, 9, 57]) + input + decrypt([63]))
print(decrypt([7, 44, 54, 39, 48, 98, 54, 42, 39, 98, 50, 35, 49, 49, 53, 45, 48, 38, 120]))
print(decrypt([1, 45, 44, 37, 48, 35, 54, 55, 46, 35, 54, 43, 45, 44, 49, 99, 99, 98, 27, 45, 55, 98,
       33, 35, 44, 98, 52, 35, 46, 43, 38, 35, 54, 39, 98, 53, 43, 54, 42, 120, 72, 46, 39, 10,
       3, 1, 9, 57]))
print(decrypt([63]))

# function ask_input() {
#   var stdin = File();
#   return stdin.readLine();
# function main() {
#   print(decrypt([7, 44, 54, 39, 48, 98, 54, 42, 39, 98, 50, 35, 49, 49, 53, 45, 48, 38, 120]));
#   var input = ask_input();
#   if (check_flag(input, Math.random())) {
#     print(decrypt(
#       [1, 45, 44, 37, 48, 35, 54, 55, 46, 35, 54, 43, 45, 44, 49, 99, 99, 98, 27, 45, 55, 98,
#        33, 35, 44, 98, 52, 35, 46, 43, 38, 35, 54, 39, 98, 53, 43, 54, 42, 120, 72, 46, 39, 10,
#        3, 1, 9, 57]) + input + decrypt([63]));
#   } else {
#     print(decrypt([21, 48, 45, 44, 37, 98, 50, 35, 49, 49, 53, 45, 48, 38]))
# main()
