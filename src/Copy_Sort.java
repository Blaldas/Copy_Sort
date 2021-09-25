public class Copy_Sort {
    public int[] copySort(int[] original_array)
    {
        int[] sorted_array = new int[original_array.length];
        int num_objs = 0;

        for(int obj : original_array){
            addIntOrdered(obj, sorted_array, num_objs);
        }
        return sorted_array;
    }

    private void addIntOrdered(int obj, int[] sorted_array, int num) {
        boolean flag = false;
        for(int i = 0; i < num; i++)
        {
            if(obj > sorted_array[i])
            {
                push_right(i, sorted_array, num);
                sorted_array[i] = obj;
                ++num;
                flag = true;
            }
        }
        if(!flag){
            sorted_array[num++] = obj;
        }
    }

    private void push_right(int initial_pos, int[] sorted_array, int last_pos) {
        for(int i = last_pos; i > initial_pos; i--)
            sorted_array[i] = sorted_array[i-1];
    }
}
