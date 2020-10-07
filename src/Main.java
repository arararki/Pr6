class Main
{
    static void reverse(Student[] array)
    {
        for (int i = 0; i < array.length / 2; i++) {
            Student temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    static void insertionSort(Student[] array)
    {
        for (int left = 0; left < array.length; left++) {

            Student value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getId() < array[i].getId()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public static void main(String[] args)
    {
        Student[] students = Student.getSamples();

        for (Student t : students) System.out.println(t);

        System.out.println();
        reverse(students);

        for (Student t : students) System.out.println(t);

        System.out.println();
        insertionSort(students);

        for (Student t : students) System.out.println(t);
    }
}