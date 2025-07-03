class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self, value):
        self.head = Node(value)

    def append(self, value):
        cur = self.head

        while cur.next is not None:
            cur = cur.next
        cur.next = Node(value)

    def print_all(self):
        cur = self.head

        while cur is not None:
            print(cur.data)
            cur = cur.next

    def get_node(self, index):
        cur = self.head
        cur_index = 0

        while cur_index != index:
            cur = cur.next
            cur_index += 1

        return cur

    def add_node(self, index, value):
        # index 위치에 value 추가하기
        new_node = Node(value)

        if index == 0:
            new_node.next = self.head
            self.head = new_node
            return

        pre_node = self.get_node(index - 1)
        next_node = pre_node.next
        pre_node.next = new_node
        new_node.next = next_node

    def delete_node(self, index):
        if index == 0:
            self.head = self.head.next
            return

        pre_node = self.get_node(index - 1)
        pre_node.next = self.get_node(index).next


def get_single_linked_list_sum(li):
    sum = 0
    cur = li.head

    while cur is not None:
        sum = sum * 10 + cur.data
        cur = cur.next

    return sum


def get_linked_list_sum(linked_list_1, linked_list_2):
    sum_1 = get_single_linked_list_sum(linked_list_1)
    sum_2 = get_single_linked_list_sum(linked_list_2)

    return sum_1 + sum_2


if __name__ == "__main__":
    # l = LinkedList(1)
    # l.append(2)
    # l.append(3)
    # l.add_node(1, 3)
    # l.add_node(0, 7)
    #
    # l.delete_node(0)
    #
    # l.print_all()

    # print("1번째 node index = ", l.get_node(1).data)

    # 문제1 - 두개의 링크드리스트에 있는 값들의 더한 값을 구하시오
    # 6 / 6 * 10 + 7 = 67 / 67 * 10 + 8 = 678
    l1 = LinkedList(6)
    l1.append(7)
    l1.append(8)

    l2 = LinkedList(3)
    l2.append(5)
    l2.append(4)

    print(get_linked_list_sum(l1, l2))
