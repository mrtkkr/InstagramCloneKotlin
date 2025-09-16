package com.mertkoker.kotlininstagram.model

// internetten gelen verileri işlerken body si felan yoksa         (Başına data koyulduğunda)
// primary constuructor da alıyorsan data class olarak bunu görebiliriz

class Post(val email: String, val comment: String, val downloadUrl : String){
}
