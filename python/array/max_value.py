# 배열 내에서 가장 큰 수 찾기
# [3, 5, 6, 1, 2, 4]

def max_value(array_len):
    max_num = array_len[0]

    for i in array_len:
        if max_num < i:
            max_num = i

    return max_num

if __name__ == "__main__":
    print("정답 : 18 / 현재 풀이 값 : ", max_value([3, 5, 6, 1, 2, 4, 18]))
    print("정답 : 6 / 현재 풀이 값 : ", max_value([3, 5, 6, 1, 2, 4]))
