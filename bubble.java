public static void main (string args [] ){

//creating a array and take value of array 
int [] arr = { 10 , 8 , 50 , 35 , 4};

// call the function  and pass arr as argument 
Sort(arr);


}



//creating sort function  and take array as argument 

public static void sort(int [] arr){
// we run external loop for bubble sort 
for(int turn = 0 ; turn = arr.length ; turn++)

{
for(int i = 0 ; i<=arr.length - turn ; i++){
if(arr[i ]> arr[i+1]{
int temp = arr[i];
arr[i] = arr[i+1];
arr[i+1] = temp;
})
}
}}
