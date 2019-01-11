public class BinarySearch {
    void printSeachResult(){

    }

    //二分查找
    static int binarySearch(int[] num, int key){
        int low = 0;
        int high = num.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;

            if (key < num[mid]){
                high = mid - 1;
            }else if (key == num[mid]){
                return mid;
            }else if (key > num[mid]){
                low = mid + 1;
            }
        }
        return -low - 1;//low 是key可以插入的位置
    }
}
