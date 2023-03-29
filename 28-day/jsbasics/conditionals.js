let day = 2;
console.log(day)

if(day == 1) { 
    console.log('👉 Mon')
}else if( day == 2) {
    console.log('👉 Tue')
} else if (day == 3) {
    console.log('👉 Wed')
} else if(day == 4) {
    console.log('👉 Thu')
} else if (day == 5) {
    console.log('👉 Fri')
} else if (day == 6) {
    console.log('👉Sat')
} else if(day == 7){
    console.log('👉 Sun')
}else { // day > 7, 0, udefined and null are false
    console.log('❌ Invalid Day')
}

switch(day) {
    case 1 : {
        console.log('👉 Mon')
        break;
    }
    case 2 : {
        console.log('👉 Tue')
        break;
    }
    case 3 : {
        console.log('👉 Wed')
        break;
    }
    case 4 : {
        console.log('👉 Thu')
        break;
    }
    case 5 : {
        console.log('👉 Fri')
        break;
    }
    case 6 : {
        console.log('👉 Sat')
        break;
    }
    case 7 : {
        console.log('👉 Sun')
        break;
    }
    default :{
        console.log('❌ Invalid Day')
    }
}