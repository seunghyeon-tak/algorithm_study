# 문자열 뒤집기
# 주어진 문자열을 모두 0 혹은 모두 1로 같게 만드는 최소 횟수를 반환하기

def find_count_turn_out_to_all_zero_or_all_one(str_number):
    all_zero = 0
    all_one = 0

    if str_number[0] == "0":
        all_zero += 1
    if str_number[0] == "1":
        all_one += 1

    for i in range(len(str_number) - 1):
        if str_number[i] != str_number[i + 1]:
            if str_number[i + 1] == "0":
                all_zero += 1
            if str_number[i + 1] == "1":
                all_one += 1

    return min(all_zero, all_one)


if __name__ == "__main__":
    print(find_count_turn_out_to_all_zero_or_all_one("011110"))
