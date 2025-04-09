/** Validação do formulario de cadastro
 * 
 * @author Renan R. de Paula
 * 
 */

function validar() {
	let nome = frmMaterial.nome.value
	let quantidade = frmMaterial.quantidade.value
	if (nome === "") {
		window.alert("Você precisa inserir o nome do produto.")
		frmMaterial.nome.focus()
		return false
	} else if (quantidade === "") {
		window.alert("Você precisa inserir a quantidade do produto.")
		frmMaterial.quantidade.focus()
		return false
	} else {
		window.alert(nome + " cadastrado com sucesso!")
		document.forms["frmMaterial"].submit()
	}
}