package com.example.cadapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cadapp.ui.theme.CADappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CADappTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CadastroScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CadastroScreen(modifier: Modifier = Modifier) {
    var nome by remember { mutableStateOf("") }
    var sobrenome by remember { mutableStateOf("") }
    var nascimento by remember { mutableStateOf("") }
    var genero by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var celular by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var endereco by remember { mutableStateOf("") }
    var numero by remember { mutableStateOf("") }
    var bairro by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var nacionalidade by remember { mutableStateOf("") }
    var profissao by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        TextField(value = nome, onValueChange = { nome = it }, label = { Text("Nome") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = sobrenome, onValueChange = { sobrenome = it }, label = { Text("Sobrenome") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = nascimento, onValueChange = { nascimento = it }, label = { Text("Data de nascimento") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = genero, onValueChange = { genero = it }, label = { Text("Gênero") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = telefone, onValueChange = { telefone = it }, label = { Text("Telefone") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = celular, onValueChange = { celular = it }, label = { Text("Celular") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = endereco, onValueChange = { endereco = it }, label = { Text("Endereço") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = numero, onValueChange = { numero = it }, label = { Text("Número") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = bairro, onValueChange = { bairro = it }, label = { Text("Bairro") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = cidade, onValueChange = { cidade = it }, label = { Text("Cidade") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = estado, onValueChange = { estado = it }, label = { Text("Estado") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = cep, onValueChange = { cep = it }, label = { Text("CEP") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = nacionalidade, onValueChange = { nacionalidade = it }, label = { Text("Nacionalidade") })
        Spacer(modifier = Modifier.height(8.dp))
        TextField(value = profissao, onValueChange = { profissao = it }, label = { Text("Profissão") })
        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            Button(onClick = {}) {
                Text("Enviar")
            }
            Button(onClick = {
                nome = ""
                sobrenome = ""
                nascimento = ""
                genero = ""
                telefone = ""
                celular = ""
                email = ""
                endereco = ""
                numero = ""
                bairro = ""
                cidade = ""
                estado = ""
                cep = ""
                nacionalidade = ""
                profissao = ""
            }) {
                Text("Limpar")
            }
        }
    }
}

@Composable
fun CadastroPreview() {
    CADappTheme {
        CadastroScreen()
    }
}
