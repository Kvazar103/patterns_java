package Strategy_pattern;
//Цей паттерн визначає сімейство алгоритмів, заворожених в окремих класах, і забезпечує можливість обміну їх між собою.
//суть патерна полягає у тому, щоб створити декілька схем поведінки для одного об'єкту та винести в окремий клас
public class Main {
    public static void main(String[] args) {

        int[] array={10,12,104,189,93,15,2,58,95,20};

        ArraySorter sorter=new ArraySorter(new BubbleSort());
        sorter.sort(array); //bubble sort
        sorter.setSortingStrategy(new MergeSort()); //міняємо нашу стратегія
        sorter.sort(array);//merge sort
    }
}
