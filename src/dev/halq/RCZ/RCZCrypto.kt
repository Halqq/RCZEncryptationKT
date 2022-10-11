package dev.halq.RCZ

object RCZCrypto {

    val ENCRYPT_MODE = 1
    val DECRYPT_MODE = 2

    fun cryptoRCZ(mode: Int, input: String): String {

        val output: ArrayList<String> = ArrayList<String>()

        when (mode) {
            1 -> {
                output.add(RCZTransformer.encodeBytes(input))
            }
            2 -> {
                output.add(RCZTransformer.decodeBytes(input).replace("-", ""))
            }
        }

        return output.toString()
    }
}