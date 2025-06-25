# 다음과 같이 영어로 되어있는 문자열이 있을 때, 문자열에서 반복되지 않는 첫번째 문자를 반환하기
# 만약, 그런 문자가 없다면 _를 반환

def find_not_repeating_first_character(str):
    alpha = {}

    for s in str:
        if s not in alpha:
            alpha[s] = 1
        else:
            alpha[s] += 1

    alpha_list = []
    for k, v in alpha.items():
        if v == 1:
            alpha_list.append(k)

    if len(alpha_list) != 0:
        return alpha_list[0]
    else:
        return "_"


if __name__ == "__main__":
    str = "aabbcddd"

    print(find_not_repeating_first_character(str))
