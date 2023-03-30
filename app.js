/ Define os saldos iniciais dos benefícios
let saldoVA = 500;
let saldoVR = 1000;
let saldoVT = 150;

// Função para verificar o saldo de cada benefício
function verificarSaldo(beneficio) {
  switch(beneficio) {
    case "VA":
      return saldoVA;
    case "VR":
      return saldoVR;
    case "VT":
      return saldoVT;
    default:
      return "Benefício inválido";
  }
}

// Exemplos de uso da função para verificar os saldos
console.log(verificarSaldo("VA")); // Output: 500
console.log(verificarSaldo("VR")); // Output: 1000
console.log(verificarSaldo("VT")); // Output: 150
console.log(verificarSaldo("VC")); // Output: Benefício inválido
