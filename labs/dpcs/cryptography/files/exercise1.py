"""
Cryptography Lab, Exercise #1 (Template Methods and Test Cases)
These are the template methods and test cases for Exercise #1 of the Cryptography Lab.
Written for the Woodstock School in Mussoorie, Uttarakhand, India.

:author     Jeffrey Santos
:version    1.0
"""

# Variable for storing the current random key.
key = ''

"""
Helper method to generate a random binary string to act as a key.

:param bitLength:   The number of bits the binary string should contain.
:return:            A trandom binary string of bitLength bits.
"""
def generateRandomKey(bitLength):
    randomKey = ''
    # To be implemented...
    return randomKey

"""
Helper method to create an Extended ASCII encoded string from a given binary string.

:param msgBitString:    The binary string to encode.
    Precondition:       msgBitString is a binary string.
:return:                A string representing the binary string encoded in Extended ASCII.
"""
def binaryToString(msgBitString):
    msgString = ''
    # To be implemented...
    return msgString

"""
Helper method to create a binary string from a given string of characters.

:param msgString:       The message to convert to a binary string.
    Precondition:       msgString is encoded in Extended ASCII
:return:                A binary string representing the message string.
"""
def stringToBinary(msgString):
    msgBitString = ''
    # To be implemented...
    return msgBitString

"""
Helper method to XOR bits in a bit string against the corresponding encryption key.

:param  msgBitString:   The bit string to XOR.
    Precondition:       msgBitString is a binary string of length <= the lenght
                        of the key binary string.
    Precondition:       key has already been initialized with a random encryption key.
:return:                The resulting binary string.
"""
def XORString(msgBitString):
    xoredString = ''
    # To be implemented...
    return xoredString

"""
Encrypts the given message using the current encryption key.

:param msg:             The message to be encrypted.
    Precondition:       msg is encoded in Extended ASCII.
    Precondition:       key has already been initialized with a random encryption key.
:return:                The encrypted message encoded in Extended ASCII.
"""
def encryptMessage(msg):
    encryptedMsg = ''
    # To be implemented...
    return encryptedMsg

"""
Decrypts the given message using the current encryption key.

:param msg:             The message to be decrypted.
    Precondition:       msg is encoded in Extended ASCII.
    Precondition:       key has already been initialized with a random encryption key.
:return:                The decrypted message encoded in Extended ASCII.
    Postcondition:      key contains a newly generated random encryption key.
"""
def decryptMessage(msg):
    decryptedMsg = ''
    # To be implemented...
    return decryptedMsg

key = generateRandomKey(32)

# Test Case #1:
message = "Hello, World!"
encryptedMessage = encryptMessage(message)
decryptedMessage = decryptMessage(encryptedMessage)

print(message)
print(encryptedMessage)
print(decryptedMessage)

# Test Case #2:
# Note: Even though the original message is the same, the encrypted message should look different due to
#       the regeneration of the encryption key after decryption.
message = "Hello, World!"
encryptedMessage = encryptMessage(message)
decryptedMessage = decryptMessage(encryptedMessage)

print(message)
print(encryptedMessage)
print(decryptedMessage)
