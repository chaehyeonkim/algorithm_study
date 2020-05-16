# algorithm_study
---

### 선형탐색(Linear Search)
- 처음부터 하나하나 비교하여 검색하는 방법
- 구현하기 쉽고, 정렬이 안되어있어도 된다
- 검색시간이 오래 걸린다
- 시간복잡도 O(n)

### 이진 탐색(Binary Search)
- 반씩 범위를 나누어 가면서 탐색하는 방법
- 속도가 빠르다
-자료구조 안 값들이 정렬되어있어야 한다
- 시간복잡도 O(log n)
- <a href="https://github.com/chaehyeonkim/algorithm_study/tree/master/Bianry%20Search"> 예제</a>


### 버블 정렬 (Bubble sort)
- 두 숫자를 비교하여 큰숫자를 오른쪽으로 스왑하며 정렬
- 시간복잡도 O(n^2)
- <a href="https://github.com/chaehyeonkim/algorithm_study/blob/master/Sort/bubbleSort.java">예제</a>

### 선택 정렬 (Selection sort)
- 가장 작은 것을 선택해서 앞으로 보내어 정렬
- 시간복잡도 O(n^2)
- <a href="https://github.com/chaehyeonkim/algorithm_study/blob/master/Sort/selectionSort.java"> 예제</a>

### 삽입 정렬 (Insertion sort)
- 각 숫자를 적절한 위치에 삽입
- 필요할 때 위치를 바꿈
- 정렬이 되어있다고 가정한다는 점에서 버블과 선택 정렬보다 빠르다
- 거의 정렬된 상태에서 정렬을 할때 가장 빠르다
- 시간복잡도 O(n^2)
- 예제

### 셸 정렬 (Shell sort)
- 삽입 정렬을 보안한 방법
- 정렬할 배열의 요소를 그룹으로 나눠 각 그룹 별로 삽입 정렬을 수행하고, 그 그룹을 합치면서 정렬을 반복하여 요소의 이동횟수를 줄이는 방법
- 
