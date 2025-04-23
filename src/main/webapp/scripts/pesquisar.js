/** Validação do formulario de cadastro
 * 
 * @author Renan R. de Paula
 * 
 */


document.getElementById("pesquisa").addEventListener("keyup", function() {
	const filtro = this.value.toLowerCase();
	const linhas = document.querySelectorAll("#tabela tbody tr");

	linhas.forEach(linha => {
		const textoLinha = linha.textContent.toLowerCase();
		linha.style.display = textoLinha.includes(filtro) ? "" : "none";
	});
});


