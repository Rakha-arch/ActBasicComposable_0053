package com.example.day2prak

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasPraktikumLayout(modifier: Modifier = Modifier) {
    // 1. Box paling luar untuk menampung Background Fullscreen dan konten di atasnya
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        // Background Image (Opsional jika ingin background foto masjid/arsitektur seperti gambar)
        // Jika tidak ada background khusus, bisa diisi warna putih/transparan atau gambar masjid
        Image(
            painter = painterResource(id = R.drawable.foto), // Ganti dengan background foto jika ada
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Lapisan transparan putih/abu-abu tipis agar teks lebih terbaca di atas background foto
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White.copy(alpha = 0.75f))
        )

        // 2. Column Utama untuk menyusun komponen secara vertikal di tengah/atas
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            // Teks "Login"
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            // Teks sub-judul
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Logo Universitas Muhammadiyah Yogyakarta (Bulat)
            // Pastikan kamu punya drawable logo UMY, misal R.drawable.logo_umy
            Image(
                painter = painterResource(id = R.drawable.logoumy), // Ganti dengan R.drawable.logo_umy
                contentDescription = "Logo UMY",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Teks "Nama" (warna merah)
            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            // Teks Nama Mahasiswa (warna biru)
            Text(
                text = "Rakha Miftahu Zahran",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            // Teks NIM (warna hitam)
            Text(
                text = "20240140053",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Foto Profil / Foto Lingkaran Besar di Bagian Bawah
            Image(
                painter = painterResource(id = R.drawable.ppp), // Ganti dengan foto kamu
                contentDescription = "Foto Profil Besar",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}