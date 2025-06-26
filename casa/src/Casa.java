
public class Casa{
    private
    Comodo[] comodos;
    int qnt_comodos;
    int max_comodos;

    public
    Casa(int max){
        max_comodos = max;
        qnt_comodos = 0;
        comodos = new Comodo[max_comodos];
    }

    void set_Comodo(String nome_Comodo, int area_Comodo){
        if (qnt_comodos == max_comodos) {
            System.out.println("Casa nao tem mais comodos disponiveis");
            return;
        }

        comodos[qnt_comodos] = new Comodo(nome_Comodo, area_Comodo);
        qnt_comodos++;
    }

    String get_Comodo_nome(int i){
        return comodos[i].nome;
    }
    int get_Comodo_area(int i){
        return comodos[i].area;
    }

    void listar_Comodos(){
        System.out.println("----------");
        System.out.println("");

        for(int i = 0; i < qnt_comodos; i++){
            System.out.println(i+1 + "- " + comodos[i].get_nome);
        }
    
        System.out.println("");
        System.out.println("----------");
    }
    int Calc_Area_Total(){
        int soma = 0;

        for(int i = 0; i < qnt_comodos; i++){
            soma += comodos[i].get_area;
        }
        
        return soma;
    }
}
