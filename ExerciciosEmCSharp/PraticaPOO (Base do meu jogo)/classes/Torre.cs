using HostileEntities;

namespace AllieEntities
{
    class Torre
    {
        public int ATK {get; private set;} //valor base para os calculos
        public double VelocidadeDeAtaque {get;} //SPS (Shoot per seccond)
        public double Escalonamento {get; private set;} //valor em % que define qual sera o dano por tiro da torre, com base no ATK
        private double DanoDoTiro => ATK * (Escalonamento / 100); //dano do tiro caculado em tempo real a cada chamada da propriedade, com base no escalonamento em %
        private double DPS => VelocidadeDeAtaque * DanoDoTiro; //DPS (dano por segundo) calculado em tempo real
        public int TamanhoDaTorre {get; set;} //valor que define os status base da torre
        public int AlcanceDaTorre {get; private set;}

        public Torre(int tamanho)
        {
            switch (tamanho)
            {
                case 1:
                    this.TamanhoDaTorre = 1; //tamanho da torre
                    this.Escalonamento = 15; //escalonamento de dano em %
                    this.ATK = 50;
                    this.VelocidadeDeAtaque = 1.5; //SPS (shoots per seccond)
                    break;
                case 2:
                    this.TamanhoDaTorre = 2;
                    this.Escalonamento = 30;
                    this.ATK = 70;
                    this.VelocidadeDeAtaque = 2.5;
                    break;
                case 3:
                    this.TamanhoDaTorre = 3;
                    this.Escalonamento = 50;
                    this.ATK = 100;
                    this.VelocidadeDeAtaque = 4;
                    break;
                default:
                    break;
            }
        }

        public string info()
        {
            return $"""
            Informaçoes da Torre 
            --------------------
            Torre de tamanho {this.TamanhoDaTorre}
            Ataque: {this.ATK}
            Velocidade de ataque: {this.VelocidadeDeAtaque} SPS (Shoots per Seccond)
            Escalonamento: {this.Escalonamento} %
            Dano por tiro: {this.DanoDoTiro.ToString("N0")}

            DPS TOTAL: {this.DPS}

            """;
        }

        public void DoDamage(Inimigo alvo)
        {
            alvo.TakeDamage(this.DanoDoTiro);
        }
    }
}