import hashlib;

str2hash="Welcome to sanjivani"

result= hashlib.sha1(str2hash.encode())

print("the hash code of SHA:", end="")

print(result.hexdigest())