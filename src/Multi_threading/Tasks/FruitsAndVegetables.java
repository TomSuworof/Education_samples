package Multi_threading.Tasks;

import java.util.ArrayList;

public class FruitsAndVegetables {
    public static void main(String[] args) {

    }

    public static class Garden {
        public ArrayList<String> fruits = new ArrayList<String>();
        public ArrayList<String> vegetables = new ArrayList<String>();

        public synchronized void addFruit(int index, String fruit) {
            synchronized (this) {
                fruits.add(index, fruit);
            }
        }
        public synchronized void removeFruit(int index) {
            synchronized (this) {
                fruits.remove(index);
            }
        }

        public synchronized void addVegetable(int index, String vegetable) {
            synchronized (this) {
                vegetables.add(index, vegetable);
            }
        }
        public synchronized void removeVegetable(int index) {
            synchronized (this) {
                vegetables.remove(index);
            }
        }
    }
}
