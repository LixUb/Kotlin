fun main() {
    var game = mutableListOf("PUBGM", "Mobile Legend", "Minecraft",)
    game.add(1,"Honkai Impact")
    game[0]="Genshin Impact"
    game -= listOf("Mobile Legend", "Minecraft")
    game += listOf("War Cry", "RDR2", "NRiH")
    println(game[0])
    println(game)

}