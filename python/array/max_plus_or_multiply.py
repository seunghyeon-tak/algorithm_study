# 왼쪽부터 차례대로 연산하는 곱셈 & 더하기
# 연산할때 더하기와 곱하기중 큰 값으로 계산해서 제일 큰 값으로 연산

def find_max_plus_or_multiply(array):
    result = array[0]

    for i in range(1, len(array)):
        sum = result + array[i]
        mul = result * array[i]
        if (sum < mul):
            result = mul
        else:
            result = sum

    return result

# 다른 풀이법
def find_max_plus_or_multiply_2(array):
    '''
    배열내의 수를 보고 어떤 연산이 나은지 정해야하는데
    인덱스의 값이 0이면 곱하는것보다 더하는게 낫다는건 누구나 생각할 수 있는 방식이다.
    그리고 이미 연산된 수를 봤을때도 0 or 1이라는 숫자는 곱하는것 보다 더하는것이 더 효율적인 방식인것을 알 수 있다.
    '''
    result = 0
    for i in array:
        if i <= 1 or result <= 1:
            result += i
        else:
            result *= i

    return result


if __name__ == "__main__":
    array = [0, 3, 5, 6, 1, 2, 4]
    # array = [3, 2, 1, 5, 9, 7, 4]

    # print(find_max_plus_or_multiply(array))
    print(find_max_plus_or_multiply_2(array))
