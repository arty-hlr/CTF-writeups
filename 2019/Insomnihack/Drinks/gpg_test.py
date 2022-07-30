import gnupg
gpg = gnupg.GPG()
import gnupg._parsers
gnupg._parsers.Verify.TRUST_LEVELS["ENCRYPTION_COMPLIANCE_MODE"] = 23


encrypted = str(gpg.encrypt("Florian||water", symmetric = True, passphrase = "WATER_2019", encrypt=False))
print(encrypted)
with open("output", "w") as f:
    f.write(encrypted)

with open("output", "r") as f:
    encrypted = f.read()
print(encrypted)

decrypted = str(gpg.decrypt(encrypted, passphrase = "WATER_2019"))
print(decrypted)
