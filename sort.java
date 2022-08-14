class Sort
{
    void merge(int arr[], int left, int middle, int right)
    {
        int low = middle - left + 1;
        int high = right - middle;

        int L[] = new int[low];
        int R[] = new int[high];

        int i = 0, j = 0;
        for (i = 0; i < low; i++){
            L[i] = arr[left + i];
            
        }
    }
}