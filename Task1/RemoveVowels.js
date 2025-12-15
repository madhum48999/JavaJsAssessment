let str = "Sterigsdklaiao    ";
let newStr = "";
for (let i = 0; i < str.length; i++) {
    if (str[i] != "a" && str[i] != "e" && str[i] != "i" && str[i] != "o" && str[i] != "u") {
        newStr += str[i];
    }
}
console.log(newStr);