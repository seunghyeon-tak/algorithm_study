def max_occurred(str):
    counter = {}

    for i in str:
        if i != ' ':
            if i in counter:
                counter[i] += 1
            else:
                counter[i] = 1

    max_val = max(counter.values())
    result = [k for k, v in counter.items() if v == max_val]

    return ', '.join(result)


if __name__ == "__main__":
    print("정답 : m | 풀이 : ", max_occurred("hello my name is mason"))
    print("정답 : e, l, o | 풀이 : ", max_occurred("we love algorithm"))
    print("정답 : b, e ,t | 풀이 : ", max_occurred("best of best youtube"))
