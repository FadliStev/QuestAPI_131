package com.example.actpertemuan9.ui.viewmodel

import com.example.actpertemuan9.data.Mahasiswa

fun Mahasiswa.toDetailEvent(): InsertUiEvent{
    return InsertUiEvent(
        nim = nim,
        nama = nama,
        alamat = alamat,
        jenisKelamin = jenisKelamin,
        kelas = kelas,
        angkatan = angkatan,
    )
}