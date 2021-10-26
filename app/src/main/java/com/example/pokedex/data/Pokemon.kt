package com.example.pokedex.data

import android.os.Parcel
import android.os.Parcelable

data class Pokemon(
    val name: String = "nombrePokemon",
    val weight: Float = 0.0f,
    val type: TypePokemon = TypePokemon.UNKNOW,
    var isCaught: Boolean = true,
    val id: String = "..id.."
): Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "nombresitoMal",
        parcel.readFloat(),
        TypePokemon.valueOf(parcel.readString() ?: "UNKNOW"),
        parcel.readInt() == 1,
        parcel.readString() ?: "id..mal"

    ) {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeFloat(weight)
        parcel.writeString(type.name)
        parcel.writeInt(if (isCaught) 1 else 0)
        parcel.writeString(id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pokemon> {
        override fun createFromParcel(parcel: Parcel): Pokemon {
            return Pokemon(parcel)
        }

        override fun newArray(size: Int): Array<Pokemon?> {
            return arrayOfNulls(size)
        }
    }

}

