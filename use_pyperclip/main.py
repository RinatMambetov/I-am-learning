import pyperclip
import time


def main():
    old = ''
    while True:
        s = pyperclip.paste()
        if s != old:
            print(s)
        old = s
        time.sleep(1)


if __name__ == '__main__':
    main()
