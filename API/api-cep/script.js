document.getElementById('cepForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const cep = document.getElementById('cepInput').value;
    const url = `https://viacep.com.br/ws/${cep}/json/`;
    
    fetch(url)
      .then(response => response.json())
      .then(data => {
        if(data.erro) {
          document.getElementById('resultado1').textContent = 'Não foi encontrado o CEP.';
          document.getElementById('resultado2').textContent = '';
          document.getElementById('resultado3').textContent = '';
        } else {
          document.getElementById('resultado1').textContent = `Cidade: ${data.localidade}`;
          document.getElementById('resultado2').textContent = `Bairro: ${data.bairro}`;
          document.getElementById('resultado3').textContent = `Rua: ${data.logradouro}`;
        }
      })
      .catch(error => {
        document.getElementById('resultado1').textContent = 'Erro ao buscar dados.';
        document.getElementById('resultado2').textContent = '';
        document.getElementById('resultado3').textContent = '';
      });
  });