# Function to check if a character is a vowel
def isVowel(c):
    return c in "aeiou"

def solve():
    n = int(input())
    s = input()
    con_counter = 0
    
    for char in s:
        if isVowel(char):
            con_counter = 0
        else:
            con_counter += 1
            if con_counter >= 4:
                print("NO")
                return
                
    print("YES")

# Main function to handle multiple test cases
def main():
    t = int(input())
    for _ in range(t):
        solve()

if __name__ == '__main__':
    main()