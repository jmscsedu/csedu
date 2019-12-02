"""
Cryptography Lab, Exercise #2 (calclate Methods and Test Cases)
These are the calclate methods and test cases for Exercise #2 of the Cryptography Lab.
Written for the Woodstock School in Mussoorie, Uttarakhand, India.

:author     Jeffrey Santos
:version    1.0
"""

n, e, p, q = (0, 0, 0, 0)

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
Decrypts the message using RSA decryption.

:param  msg:            The message to decrypt.
:return:                The decrypted message.
"""
def decryptMessage(msg):
    decryptedMsg = ''
    # To be implemented...
    return decryptedMsg

"""
Encrypts the message using RSA encryption.

:param  msg:            The message to encrypt.
:return:                The encrypted message.
"""
def encryptMessage(msg):
    encryptedMsg = ''
    # To be implemented...
    return encryptedMsg

"""
Performs modular exponentiation.

:param  base:       The base for modular exponentiation.
:param  exponent:   The exponent for modular exponentiation.
:param  m:          The modulus for modular exponentiation.
:return:            The result of base^exponent mod m.
"""

def modExp(base, exponent, m):
    if exponent == 0:
        return 1
    
    calc = 0
    if exponent % 2 == 0:
        calc = modExp(base, exponent // 2, m)
        calc = (calc * calc) % m
    else:
        calc = base % m
        calc = (calc * modExp(base, exponent - 1, m) % m) % m
    
    return (calc + m) % m


"""
Calculates the value, d, such that ed == 1 mod m using Euclid's Extended Algorithm.

:param  e:          The value for which an inverse is requested.
    Precondition:   e < m
:param  m:          The modulus for finding the inverse.
:return:            The value, d, such that ed == 1 mod m.
"""
def calcModInverse(e, m):
    modulus, x, y, buffer, quotient = m, 0, 1, 0, 0

    if m == 1:
        return 0
    
    while e > 1:
        quotient = e // m
        buffer = m
        m = e % m
        e = buffer

        buffer = x
        x = y - quotient * x
        y = buffer
    if y < 0:
        y = y + modulus
    return y

# Test Case:

(p, q, e) = (1013839, 67866833, 47)
n = p * q

message = "Tests"
encryptedMessage = encryptMessage(message)
decryptedMessage = decryptMessage(encryptedMessage)

print(message)
print(encryptedMessage) # 1010100000111010110011111010110110111011110100
print(decryptedMessage)