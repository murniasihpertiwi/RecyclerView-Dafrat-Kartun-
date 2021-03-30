package com.example.daftarkartun;

import java.util.ArrayList;

public class KartunData {
    private static String [] kartunName = {
            "Boboiboy",
            "Frozen",
            "Kiko",
            "Mickey Mouse",
            "Minions",
            "Monsters Inc",
            "Naruto",
            "Pororo",
            "Spongebob",
            "Teletubies",
            "Tom and Jerry",
            "Toy Story",
            "Upin & Ipin",
            "Zoo Topia"

    };

    private static String [] kartunDetail = {
            "BoBoiBoy adalah sebuah serial animasi Malaysia yang diproduksi oleh Animonsta Studios. Serial animasi ini menceritakan tentang seorang anak yang memiliki kekuatan luar biasa untuk melawan makhluk asing yang ingin menyerang Bumi.",
            "Frozen bercerita tentang seorang putri yang tak kenal takut yang melakukan perjalanan bersama tukang es yang kasar, rusa yang setia, dan manusia salju yang naif untuk menemukan saudara perempuannya yang terasing, yang kekuatan esnya secara tidak sengaja telah menjebak kerajaan mereka di musim dingin yang abadi.",
            "Kiko mengisahkan seekor anak ikan mas koki yang sangat mandiri, walaupun ia anak tunggal. Kiko yang selalu riang memiliki empat sahabat baik yaitu Lola si ikan diskus, Ting Ting si kepiting, Patino si ikan patin dan Poli si ikan cupang.",
            "Mickey Mouse adalah tokoh fiksi kartun berbentuk seekor tikus yang menjadi ikon bagi The Walt Disney Company yang diciptakan oleh Ub Iwerks pada 1920-an.",
            "Minions adalah makhluk kecil berwarna kuning yang telah ada sejak mualainya awal waktu, berevolusi dari organisme bersel tunggal kuning menjadi makhluk yang hanya ada untuk melayani tuan yang paling jahat dalam sejarah.",
            "Monstropolis, sebuah kota Metropolis yang seluruh penduduknya adalah monster memiliki sebuah perusahaan bernama Monsters Inc. yang menghidupi kota ini dengan cara menakuti anak-anak di seluruh dunia.",
            "Naruto adalah sebuah serial manga karya Masashi Kishimoto yang diadaptasi menjadi serial anime. Manga Naruto bercerita seputar kehidupan tokoh utamanya, Naruto Uzumaki, seorang ninja yang hiperaktif, periang.",
            "Pororo the Little Penguin adalah sebuah serial animasi televisi Korea yang diproduksi oleh Iconix Entertainment, SK Broadband, Ocon dan Channel One bersama dengan perusahaan asal Korea Utara Samchŏlli di Kaesong.",
            "SpongeBob SquarePants adalah seekor spons laut berwarna kuning dan berlubang-lubang, yang tinggal dalam sebuah rumah nanas dalam laut di kota Bikini Bottom, di lautan Pasifik.",
            "Teletubbies adalah sebuah acara televisi asal Inggris yang dikhususkan untuk penonton anak-anak usia prasekolah, diciptakan oleh Anne Wood dan Andrew Davenport dari Ragdoll Productions.",
            "Tom and Jerry adalah sebuah film komedi aksi-hidup/animasi Amerika Serikat tahun 2020 garapan Tim Story dan berdasarkan pada karakter-karakter kartun dan seri kartun teatrikal Tom and Jerry buatan William Hanna dan Joseph Barbera pada 1940.",
            "Toy Story adalah sebuah film serial animasi CGI dan media waralaba Disney yang dimulai dengan sebuah karya film pada tahun 1995, Toy Story, yang diproduksi oleh Pixar Animation Studios dan dirilis oleh Walt Disney Pictures.",
            "Upin & Ipin adalah serial televisi animasi anak-anak yang dirilis pada tanggal 14 September 2007 yang ditayangkan di Malaysia dan Indonesia yaitu TV9 dan MNCTV. Serial ini yang diproduksi oleh Les' Copaque Production. Awalnya film ini bertujuan untuk mendidik anak-anak biar lebih mengerti tentang Ramadan.",
            "Zootopia adalah film animasi 3D Amerika Serikat tahun 2016 yang disutradarai oleh Byron Howard dan Rich Moore serta diproduseri oleh Clark Spencer. Naskah film ini ditulis oleh Jared Bush dan Phil Johnston."

    };

    private static int[] kartinImage = {
            R.drawable.boboiboy,
            R.drawable.frozen,
            R.drawable.kiko,
            R.drawable.micky_mouse,
            R.drawable.minions,
            R.drawable.monster_inc,
            R.drawable.naruto,
            R.drawable.pororo,
            R.drawable.spongebob,
            R.drawable.teletubbies,
            R.drawable.tom_and_jerry,
            R.drawable.toy_story,
            R.drawable.upin_dan_ipin,
            R.drawable.zoo_topia
    };

    static ArrayList<Kartun> getListData(){
        ArrayList<Kartun> list = new ArrayList<>();
        for (int position = 0; position <kartunName.length; position++) {
            Kartun kartun = new Kartun();
            kartun.setName(kartunName[position]);
            kartun.setDetail(kartunDetail[position]);
            kartun.setPhoto(kartinImage[position]);
            list.add(kartun);
        }
        return list;
    }
}
