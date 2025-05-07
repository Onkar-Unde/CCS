from Crypto.cipher import AES
from secrets import token_bytes
key = b'C&F)H@McQf9TjWnZr'
cipher = new( key, AES.MODE_EAX)
data="Welcome to Sanjivani".encode()
nonce= cipher.nonce
ciphertext= cipher.encrypt(data)
print(ciphertext)
plaintext= cipher.decrypt(ciphertext)
print(plaintext)

