let arr1 = [1, 1, 5, 2, 3, 4, 4, 5, 4, 5];
let arr = arr1.sort();

for (let i = 0; i < arr.length; i++) {
    let count = 0;
    for (let j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
            count++;
        }
    }
    if (count > 0) {
        console.log(arr[i] + " is duplicate ");
    }
}
