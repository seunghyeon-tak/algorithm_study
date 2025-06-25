# 배열에서 특정 요소 찾기
# [3,5,6,1,2,4] - 특정 숫자 존재 True, 없으면 False

def is_number_exit(number, array):
    for a in array:
        if a == number:
            return True
    return False


if __name__ == "__main__":
    number = 9
    array = [3, 5, 6, 1, 2, 4]

    print(is_number_exit(number, array))
