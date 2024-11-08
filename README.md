<h1>Projeto: Encontrar o Maior Valor em um Vetor de Inteiros</h1>

<p>Este projeto em Java consiste em uma aplicação que recebe um vetor de números inteiros fornecidos pelo usuário e retorna o maior valor encontrado nesse vetor. A aplicação é executada em terminal e permite que o usuário defina o tamanho e os valores do vetor.</p>

<h2>Estrutura do Projeto</h2>

<p>O projeto é organizado em duas classes principais:</p>
<ul>
    <li><strong>Main</strong>: Classe principal responsável pela interação com o usuário e pela execução do programa.</li>
    <li><strong>maior_vetor</strong>: Classe que contém a lógica para encontrar o maior valor no vetor fornecido.</li>
</ul>

<h3>Classes e Métodos</h3>

<h4>Classe Main</h4>
<p>A classe <code>Main</code> é o ponto de entrada do programa e realiza as seguintes etapas:</p>
<ul>
    <li>Solicita ao usuário o tamanho do vetor e os valores de cada posição.</li>
    <li>Armazena os valores em um vetor de inteiros.</li>
    <li>Utiliza o método <code>multiplicador</code> da classe <code>maior_vetor</code> para determinar o maior valor.</li>
    <li>Exibe o maior valor encontrado ao usuário.</li>
</ul>

<h4>Classe maior_vetor</h4>
<p>A classe <code>maior_vetor</code> contém o método <code>multiplicador</code>, que realiza a lógica de identificação do maior valor no vetor.</p>

<h5>Método multiplicador</h5>
<ul>
    <li><strong>Parâmetro</strong>: Recebe um vetor de números inteiros (<code>int[] numeros</code>).</li>
    <li><strong>Processo</strong>: Percorre os elementos do vetor e compara cada valor ao maior valor encontrado até o momento, atualizando-o sempre que um valor maior é encontrado.</li>
    <li><strong>Retorno</strong>: Após percorrer o vetor, retorna o maior valor encontrado.</li>
</ul>

<h3>Resumo do Funcionamento do Programa</h3>
<ol>
    <li><strong>Interação com o Usuário</strong>: Solicita o tamanho do vetor e os valores de cada posição.</li>
    <li><strong>Processamento do Vetor</strong>: Determina o maior valor no vetor usando o método <code>multiplicador</code>.</li>
    <li><strong>Exibição do Resultado</strong>: Exibe o maior valor encontrado no console.</li>
</ol>

<h3>Observações Importantes</h3>
<p>Este projeto é voltado para fins de aprendizado e prática de manipulação de vetores e operações básicas em Java.</p>
