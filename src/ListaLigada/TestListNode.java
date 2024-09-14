package ListaLigada;

import Entities.Teacher;

public class TestListNode {
    public static void main(String[] args) {
        ListNode<Teacher> list = new ListNode<>();

        list.addElement(new Teacher("Angela", "Estrutura de dados"));
        list.addElement(new Teacher("Samiramis", "Desenvolvedor Web"));
        list.addElement(new Teacher("Isidro", "Java"));


        ListNode<Integer> listInt = new ListNode<>();

        listInt.addElement(1);
        listInt.addElement(5);
        listInt.addElement(6);

        listInt.removeFirstElement();

        System.out.println(list);
        System.out.println(listInt);
    }
}
