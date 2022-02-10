package com.example.massangerinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.massangerinkotlin.adapter.ChatAdapter
import com.example.massangerinkotlin.model.Chat
import com.example.massangerinkotlin.model.Message
import com.example.massangerinkotlin.model.Room

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this,1))

        refreshAdapters(getAllChats())
    }

    private fun refreshAdapters(chats:ArrayList<Chat>) {
        val adapter = ChatAdapter(this,chats)
        recyclerView!!.adapter = adapter

    }

    private fun getAllChats(): ArrayList<Chat> {
        val stories: ArrayList<Room> = ArrayList<Room>()
        stories.add(Room(R.drawable.img1,"Ilhombek Ubaydullayev"))
        stories.add(Room(R.drawable.img2,"Laziz Ubaydullayev"))
        stories.add(Room(R.drawable.img3,"Amir Ubaydullayev"))
        stories.add(Room(R.drawable.img4,"Said Ubaydullayev"))
        stories.add(Room(R.drawable.img5,"Jamshid Ubaydullayev"))
        stories.add(Room(R.drawable.img6,"Begzod Ubaydullayev"))
        stories.add(Room(R.drawable.img1,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img2,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img2,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img3,"Abdulhay Ubaydullayev"))
        stories.add(Room(R.drawable.img4,"Abdulhay Ubaydullayev"))

        val chats: ArrayList<Chat> = ArrayList()

        chats.add(Chat(stories))

        chats.add(Chat(Message(R.drawable.img1,"Ilhombek",false)))
        chats.add(Chat(Message(R.drawable.img2,"Maqsit",true)))
        chats.add(Chat(Message(R.drawable.img3,"Jamol",false)))
        chats.add(Chat(Message(R.drawable.img4,"Karim",true)))
        chats.add(Chat(Message(R.drawable.img5,"Leyla",false)))
        chats.add(Chat(Message(R.drawable.img6,"Amanda",true)))
        chats.add(Chat(Message(R.drawable.img1,"Alex",false)))
        chats.add(Chat(Message(R.drawable.img2,"Bahodir",true)))
        chats.add(Chat(Message(R.drawable.img3,"Olim",false)))
        chats.add(Chat(Message(R.drawable.img4,"Zayniddin",true)))
        chats.add(Chat(Message(R.drawable.img5,"Javohir",false)))
        chats.add(Chat(Message(R.drawable.img6,"Umit",true)))
        chats.add(Chat(Message(R.drawable.img2,"Zaynab",false)))
        chats.add(Chat(Message(R.drawable.img1,"Sherali",false)))

        return chats
    }
}