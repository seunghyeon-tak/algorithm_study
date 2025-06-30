# 소수 나열하기

def find_prime_list_under_number(number):
    prime_list = []
    for i in range(2, number + 1):
        for j in prime_list:
            if j * j <= i and i % j == 0:
                break
        else:
            prime_list.append(i)

    return prime_list


if __name__ == "__main__":
    print(find_prime_list_under_number(20))
