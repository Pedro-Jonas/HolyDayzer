import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Feriados implements FeriadosInterface {
    Feriado confraternizacao = new Feriado( "Confraternização mundial", "01/01/2023");
    Feriado carnaval = new Feriado( "Carnaval", "21/02/2023");
    Feriado pascoa = new Feriado("Páscoa", "17/04/2023");
    Feriado tiradentes = new Feriado( "Tiradentes", "21/04/2023");
    Feriado diaDoTrabalho = new Feriado( "Dia do trabalho", "01/05/2023");
    Feriado corpusChristi = new Feriado( "Corpus Christi", "08/06/2023");
    Feriado indepedencia = new Feriado( "Independência do Brasil", "07/09/2023");
    Feriado nossaSenhoraAparecida = new Feriado( "Nossa Senhora Aparecida", "12/10/2023");
    Feriado finados = new Feriado( "Finados", "01/11/2023");
    Feriado proclamacaoDaRepublica = new Feriado( "Proclamação da República", "15/11/2023");
    Feriado natal = new Feriado( "Natal", "25/12/2023");
    

    public Feriado[] ListaDeFeriados = new Feriado[] {confraternizacao ,carnaval, pascoa, tiradentes, diaDoTrabalho, corpusChristi, indepedencia, nossaSenhoraAparecida, finados, proclamacaoDaRepublica, natal};


    public void Mostrar() {
        for (int index = 0; index < ListaDeFeriados.length; index++) {
            System.out.println(ListaDeFeriados[index].getNome() + " - " + ListaDeFeriados[index].getData());
        }
    }

    public void TemFeriado(String data) {
        List<Feriado> lista = Arrays.asList(ListaDeFeriados);
        List<Feriado> acheiFeriado = new ArrayList<>();
        lista.stream().filter(feriado -> feriado.getData().equals(data)).forEach(feriado -> acheiFeriado.add(feriado));
        if (acheiFeriado.size() == 1) {
            System.out.println(acheiFeriado.get(0).getNome() + " - " + acheiFeriado.get(0).getData());
        } else {
            System.out.println("Ops, nenhum feriado com essa data :( ");
        }
        
    }

}
