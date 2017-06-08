import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
Задача коммивояжора
 int[] A - внутри идентификаторы мест
 А[K] - 0 <= K <= N; N - к-во дней
 К может принимать значения от 1 до 100000
 Массив не может быть пустым или содержать меньше больше значений
 Необходимо найти минимальное количество дней за которое удастся посетить все места.
 При использовании эталлоного массива - int[] A = { 7, 3, 7, 3, 1, 3, 4, 1 };
 Ответ 5 - начало путешествия элемент №2 конец №6 - будут посещенны места - 7, 3, 1, 3, 4.
 */
public class Traveler {
    public int solution(int[] A) {
        int maxNumberOfDays = findingMaxElement(A);
        Set<Integer> setUniqueElem = findingUniqueValues(A);
        List<Integer> listTempElem = new ArrayList<>();
        int minNumberOfDays = setUniqueElem.size();
        if(minNumberOfDays == 1)    {
            return 1;
        }
        for (int i = minNumberOfDays; i <= maxNumberOfDays; i++)    {
            for (int j = 0; j < A.length - i; j++) {
                for (int k = j; k <= j + i; k++) {               //A.length -ALWAYS- > maxNumberOfDays
                    listTempElem.add(A[k]);
                }
                if (listTempElem.containsAll(setUniqueElem)) {
                    return i+1;
                }
                listTempElem.clear();
            }
        }
        return minNumberOfDays;
    }

    static Integer findingMaxElement(int[] array)  {
        Integer max = null;         //return null if the array is empty
        if (array != null) {
            if (array.length == 1) {
                max = array[0];
            }
            if (array.length >= 2) {
                max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (max < array[i]) {
                        max = array[i];
                    }
                }
            }
        }
        return max;
    }

    HashSet<Integer> findingUniqueValues(int[] array) {
        HashSet<Integer> mySet = new HashSet<>();
        for (int x : array) {
            mySet.add(x);
        }
        return mySet;
    }

    public static void main(String[] args) {
        Traveler traveler = new Traveler();
//        int[] array1 = { 0 };
//        int[] A = { 7, 3, 7, 3, 1, 3, 4, 1 };
//        int[] A = { 7, 3, 7, 3, 1, 3, 1, 1, 4, 1 };
        int[] A = { 7, 3, 7, 3, 1, 3, 1, 8, 4, 2 };
        System.out.println(traveler.solution(A));

    }
}
