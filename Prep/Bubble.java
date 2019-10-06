public class Bubble{
	public void runSort(SortArray array){
	for(int i = 0; i < len -1; i++){
	    for(int j = 0; j < len - i -1; j++){
		if(array.getValue(j) > array.getValue(j + 1)){
		   array.swap(j,j+1,2);
		}
	    }
	}
}
