package com.erbe.kotlinlib.koans.introduction

/*
Read about null safety and safe calls in Kotlin and rewrite the following Java code using only one if expression:

public void sendMessageToClient(
@Nullable Client client,
@Nullable String message,
@NotNull Mailer mailer
) {
    if (client == null || message == null) return;

    PersonalInfo personalInfo = client.getPersonalInfo();
    if (personalInfo == null) return;

    String email = personalInfo.getEmail();
    if (email == null) return;

    mailer.sendMessage(email, message);
}
*/

fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun main() {
    val info = PersonalInfo("info")
    val client = Client(info)
    sendMessageToClient(client, "message", object : Mailer {
        override fun sendMessage(email: String, message: String) {
            println("$email: $message")
        }
    })
}