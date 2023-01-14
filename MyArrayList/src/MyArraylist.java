import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-14
 * @Time: 20:39
 */
public class MyArraylist {

        public int[] elem;
        public int usedSize;

        private static final int DEFAULT_SIZE = 10;

        public MyArraylist() {
                this.elem = new int[DEFAULT_SIZE];
        }


        /**
         * 打印顺序表:
         * 根据usedSize判断即可
         */
        public void display() {
                for (int i = 0; i < usedSize; i++) {
                        System.out.println(elem[i]+" ");
                }
        }

        /**
         * 新增元素,默认在数组最后新增
         */
        public void add(int data) {
                if(isFull()) {
                        resize();
                }
                elem[usedSize] = data;
                usedSize++;
        }
        public void  resize() {
                elem = Arrays.copyOf(elem,2*elem.length);
        }

        /**
         * 判断当前的顺序表是不是满的！
         *
         * @return true:满   false代表空
         */
        public boolean isFull() {
                if(usedSize == elem.length) {
                        return true;
                }
                return false;
        }


        private boolean checkPosInAdd(int pos) {
                if(pos < 0 || pos >= size()){
                        return false;
                }
                return true;
        }

        /**
         *  在 pos 位置新增元素
         * @param pos
         * @param data
         */
        public void add(int pos, int data) {
                if(checkPosInAdd(pos)) {
                        for (int i = usedSize-1; i >= pos; i--) {
                            elem[i+1]  =elem[i];
                        }
                        elem[pos] = data;
                } else {
                        throw new PosExcption("检查下标输入是否合法!!");
                }
        }

        /**
         * 判定是否包含某个元素
         * @param toFind
         * @return
         */
        public boolean contains(int toFind) {
                for (int i = 0; i < usedSize; i++) {
                        if(elem[i]==toFind) {
                                return true;
                        }
                }
                return false;
        }

        /**
         * 查找某个元素对应的位置
          * @param toFind
         * @return
         */
        public int indexOf(int toFind) {
                for (int i = 0; i < usedSize; i++) {
                    if(elem[i] == toFind) {
                            return i;
                    }
                }
                return -1;
        }

        /**
         * 获取 pos 位置的元素
         */
        public int get(int pos) {
                if(checkPosInAdd(pos)) {
                        return elem[pos];
                } else {
                        throw new PosExcption("检查下标输入是否合法!!");
                }
        }

        private boolean isEmpty() {
                if(usedSize == 0) {
                        return  true;
                }
                return false;
        }

        /**
         * 给 pos 位置的元素设为【更新为】 value
         * @param pos
         * @param value
         */
        public void set(int pos, int value) {
                if(checkPosInAdd(pos)) {
                        elem[pos] = value;
                } else {
                        throw new PosExcption("检查下标输入是否合法!!");
                }
        }
        /**
         * 删除第一次出现的关键字key
         *
         * @param key
         */
        public void remove(int key) {
                for (int i = 0; i < usedSize-1; i++) {
                    if(elem[i] == key) {
                            elem[i] =elem[i+1];
                    }
                }
                usedSize--;
        }

        /**
         *  获取顺序表长度
         * @return
         */
        public int size() {
                return usedSize;
        }

        /**
         * 清空顺序表
         */
        public void clear() {
                for (int i = 0; i < size(); i++) {
                        elem[i] = 0;
                }
        }
}