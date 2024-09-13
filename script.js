let A = [5, 6, 0, 4, 6, 0, 9, 0, 8];
let n = A.length;
let B = new Array(n);
let j = 0;
let count = 0;

for (let i = 0; i < n; i++) {
    if (A[i] !== 0) {
        B[j] = A[i];
        j++;
    } else {
        count++;
    }
}

while (count > 0) {
    B[j] = 0;
    count--;
    j++;
}

for (let i = 0; i < n; i++) {
    A[i] = B[i];
}

// Print the array in a single line
console.log(A.join(" "));
