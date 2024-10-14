document.addEventListener("DOMContentLoaded", function(){

    var dadosSuperHeroi = {
        "nomeEsquadrao": "Esquadrao de herois",
        "cidade": "Brasilia City",
        "formado": 2019,
        "baseSecreta" : "taverna do marcos",
        "ativa": true,
        "membros":[
            {
                "nome": "Marcos Pitu",
                "idade": 28,
                "identidadeSecreta": "CC Man",
                "poderes" : ["Escrever Boas Linhas de Código", "Boleiro", "Criador de Conteúdo"]
            },
            {
                "nome": "Breno",
                "Idade": 85,
                "identidadeSecreta": "Bernardo",
                "poderes": ["Jornalismo", "Investigador", "Injustiçado"]
            },
            {
                "nome": "Susana Perigosa",
                "idade": 21,
                "identidadeSecreta": "CoringaGirl",
                "poderes": ["Jiu-Juitsu", "Turismo", "Capoeirista"]
            }
        ]

    };
    //selecionar a lista de super-herois onde a gente deseja inserir os membros
    var listaSuperHerois = document.getElementById("superheroes-list")

    //iteração sobre os membros da equipe criando os elementos de lista para cada um
    dadosSuperHeroi.membros.forEach(function(membro){
        var li = document.createElement("li")
        li.className = "list-group-item"
        li.innerHTML = `<strong>${membro.nome}</strong> (idade: ${membro.idade}, Identidade Secreta: ${membro.identidadeSecreta})<br>
        Poderes: ${membro.poderes.join(", ")}`
        listaSuperHerois.appendChild(li)
    })
})