package com.example.ucp2pam

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ucp2pam.ui.theme.UCP2PAMTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
) {
    var namaText by remember {
        mutableStateOf("")
    }
    var nimText by remember {
        mutableStateOf("")
    }
    var konsenText by remember {
        mutableStateOf("")
    }
    var judulText by remember {
        mutableStateOf("")
    }

    var listData: MutableList<String> = mutableListOf(namaText, nimText, konsenText, judulText)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Formulir Pengajuan Skripsi", fontWeight = FontWeight.Bold, fontSize = 25.sp)
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = namaText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.nama_mahasiswa)) },
                onValueChange = { namaText = it }
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = nimText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.nim)) },
                onValueChange = { nimText = it }
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = konsenText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.konsen)) },
                onValueChange = { konsenText = it }
            )
            Spacer(modifier = Modifier.padding(10.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = judulText,
                shape = MaterialTheme.shapes.large,
                label = { Text(text = stringResource(id = R.string.judul_skripsi)) },
                onValueChange = { judulText = it }
            )


            Spacer(modifier = Modifier.padding(10.dp))
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.weight(1f)) {
                Text(text = stringResource(id = R.string.submit_button))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    UCP2PAMTheme {
        HalamanForm(onSubmitButtonClicked = {})
    }
}